/* standard headers */
#include <stdlib.h>
#include <unistd.h>

/* mraa header */
#include "mraa/pwm.h"

int main(int argc, char** argv)
{
    if(argc < 4) {
        fprintf(stderr, "Invalid arguments!!!\n");
        return EXIT_FAILURE;
    }

    mraa_result_t status = MRAA_SUCCESS;
    mraa_pwm_context pwm;
    int pwm_pin = atoi(argv[1]);
    int freq = atoi(argv[2]);
    int duty_cycle = atoi(argv[3]);

    /* initialize mraa for the platform (not needed most of the times) */
    mraa_init();

    //! [Interesting]
    pwm = mraa_pwm_init(pwm_pin);
    if (pwm == NULL) {
        fprintf(stderr, "Failed to initialize PWM\n");
        mraa_deinit();
        return EXIT_FAILURE;
    }

    /* set PWM period */
    status = mraa_pwm_period_us(pwm, freq);
    if (status != MRAA_SUCCESS) {
        goto err_exit;
    }

    /* set PWM duty cycle */
    status = mraa_pwm_pulsewidth_us(pwm, duty_cycle);
    if (status != MRAA_SUCCESS) {
        goto err_exit;
    }

    /* enable PWM */
    status = mraa_pwm_enable(pwm, 1);
    if (status != MRAA_SUCCESS) {
        goto err_exit;
    }

    while(1);

    /* close PWM */
    mraa_pwm_close(pwm);

    //! [Interesting]
    /* deinitialize mraa for the platform (not needed most of the times) */
    mraa_deinit();

    return EXIT_SUCCESS;

err_exit:
    mraa_result_print(status);

    /* close PWM */
    mraa_pwm_close(pwm);

    /* deinitialize mraa for the platform (not needed most of the times) */
    mraa_deinit();

    return EXIT_FAILURE;
}
