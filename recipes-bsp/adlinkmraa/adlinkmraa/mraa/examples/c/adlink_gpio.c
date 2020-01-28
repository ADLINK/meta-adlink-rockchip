#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <syslog.h>
#include "mraa.h"
#include <signal.h>
#include <unistd.h>

volatile sig_atomic_t flag = 1;

void
sig_handler(int signum)
{
    if (signum == SIGINT) {
        fprintf(stdout, "Exiting...\n");
        flag = 0;
    }
}



int main(int argc, char** argv)
{
	if(argc < 2) {
		fprintf(stderr, "Invalid arguments!!!\n");
		return EXIT_FAILURE;
	}

	int gpio_pin;
	const char* board_name = mraa_get_platform_name();
	gpio_pin = atoi(argv[1]);		
	fprintf(stdout, "MRAA!!!\n Version: %s\n Running on %s\n", mraa_get_version(), board_name);

	//GPIO
	mraa_gpio_context gpio;
	mraa_result_t status;

    /* install signal handler */
    signal(SIGINT, sig_handler);

	/* initialize GPIO pin */
	gpio = mraa_gpio_init(gpio_pin);
	if (gpio == NULL) {
		fprintf(stderr, "Failed to initialize GPIO %d\n", gpio_pin);
		mraa_deinit();
		return;
	}

	status = mraa_gpio_dir(gpio, MRAA_GPIO_OUT);
	if (status != MRAA_SUCCESS) {
		fprintf(stderr, "GPIO direction setup failed%d\n", gpio_pin);
	}

	while(flag)
	{
		status = mraa_gpio_write(gpio, 1);
		if (status != MRAA_SUCCESS) {
			fprintf(stderr, "GPIO write failed%d\n", gpio_pin);
		}
		sleep(1);

		status = mraa_gpio_write(gpio, 0);
		if (status != MRAA_SUCCESS) {
			fprintf(stderr, "GPIO write failed%d\n", gpio_pin);
		}
		sleep(1);
	}

	mraa_deinit();

	return MRAA_SUCCESS;
}
