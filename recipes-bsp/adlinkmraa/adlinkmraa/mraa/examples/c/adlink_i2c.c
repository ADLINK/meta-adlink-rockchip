/* standard headers */
#include <endian.h>
#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

/* mraa header */
#include "mraa/i2c.h"

/* I2C bus */
#define I2C_BUS 0

/* register definitions */
#define I2C_ADDR 0x68

int main (void)
{
    mraa_result_t status = MRAA_SUCCESS;
    mraa_i2c_context i2c;
    uint8_t data;
    int ret;

    /* initialize mraa for the platform (not needed most of the times) */
    mraa_init();

    /* initialize I2C bus */
    i2c = mraa_i2c_init(I2C_BUS);
    if (i2c == NULL) {
        fprintf(stderr, "Failed to initialize I2C\n");
        mraa_deinit();
        return EXIT_FAILURE;
    }

    /* set slave address */
    status = mraa_i2c_address(i2c, I2C_ADDR);
    if (status != MRAA_SUCCESS) {
        goto err_exit;
    }

    /* reset the sensor */
    status = mraa_i2c_write_byte_data(i2c, 0x12, 0x34);
    if (status != MRAA_SUCCESS) {
        goto err_exit;
    }

    /* stop i2c */
    mraa_i2c_stop(i2c);

    //! [Interesting]
    /* deinitialize mraa for the platform (not needed most of the times) */
    mraa_deinit();

    return EXIT_SUCCESS;

err_exit:
    mraa_result_print(status);

    /* stop i2c */
    mraa_i2c_stop(i2c);

    /* deinitialize mraa for the platform (not needed most of the times) */
    mraa_deinit();

    return EXIT_FAILURE;
}
