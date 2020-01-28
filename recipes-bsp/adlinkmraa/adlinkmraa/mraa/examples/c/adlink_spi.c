#include <stdio.h>
#include <string.h>
#include <syslog.h>
#include "mraa.h"

/* SPI declaration */
#define SPI_BUS 0

/* SPI frequency in Hz */
#define SPI_FREQ 100000

int main(int argc, char** argv)
{
	const char* board_name = mraa_get_platform_name();

	fprintf(stdout, "MRAA!!!\n Version: %s\n Running on %s\n", mraa_get_version(), board_name);

	mraa_result_t status = MRAA_SUCCESS;
	mraa_spi_context spi;
	int i, j;

	/* initialize mraa for the platform (not needed most of the times) */
	mraa_init();

	/* initialize SPI bus */
	spi = mraa_spi_init(SPI_BUS);
	if (spi == NULL) {
		fprintf(stderr, "Failed to initialize SPI\n");
		mraa_deinit();
		return EXIT_FAILURE;
	}

	/* set SPI frequency */
	status = mraa_spi_frequency(spi, SPI_FREQ);
	if (status != MRAA_SUCCESS)
		goto err_exit;

	while (1) {
		for (i = 1; i <= 8; i++) {
			for (j = 0; j < 8; j++) {
				mraa_spi_write_word(spi, (i << 8) + (1 << j));
				sleep(1);
			}
			mraa_spi_write_word(spi, i << 8);
		}
	}

	/* stop spi */
	mraa_spi_stop(spi);

	mraa_deinit();

	return MRAA_SUCCESS;


err_exit:
	mraa_result_print(status);

	/* stop spi */
	mraa_spi_stop(spi);

	/* deinitialize mraa for the platform (not needed most of the times) */
	mraa_deinit();

	exit(EXIT_FAILURE);
}
