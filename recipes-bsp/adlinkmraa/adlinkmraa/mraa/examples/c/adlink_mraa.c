#include <stdio.h>
#include <string.h>
#include <syslog.h>
#include "mraa.h"

int main(int argc, char** argv)
{
	int i;
	int pin_count = mraa_get_pin_count();
	const char* board_name = mraa_get_platform_name();

	fprintf(stdout, "MRAA!!!\n Version: %s\n Running on %s\n", mraa_get_version(), board_name);
	fprintf(stdout, "pin count = %d\n", pin_count);

	for(i=0; i<pin_count; i++) {
		fprintf(stdout, "%2d -> %s\n", i, mraa_get_pin_name(i));
	}

	mraa_deinit();

	return MRAA_SUCCESS;
}
