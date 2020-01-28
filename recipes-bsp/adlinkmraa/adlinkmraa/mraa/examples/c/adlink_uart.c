#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

/* mraa header */
#include "mraa/uart.h"

#define UART 0

int main(int argc, char** argv)
{
    mraa_uart_context uart;
    char buffer[] = "Adlink MRAA!\r\n";

    /* initialize mraa for the platform (not needed most of the times) */
    mraa_init();

    /* initialize UART */
    uart = mraa_uart_init(UART);
    if (uart == NULL) {
        fprintf(stderr, "Failed to initialize UART\n");
        goto err_exit;
    }

    while (1) {
        /* send data through UART */
        mraa_uart_write(uart, buffer, sizeof(buffer));

        sleep(1);
    }

    /* stop UART */
    mraa_uart_stop(uart);

    //! [Interesting]
    /* deinitialize mraa for the platform (not needed most of the times) */
    mraa_deinit();

    return EXIT_SUCCESS;

err_exit:
    /* deinitialize mraa for the platform (not needed most of the times) */
    mraa_deinit();

    return EXIT_FAILURE;
}
