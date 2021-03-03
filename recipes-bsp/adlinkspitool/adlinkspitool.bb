SUMMARY = "ADLINK SPI test application"
DESCRIPTION = "SPI Interface Testing"
LICENSE = "CLOSED"


SRC_URI = "\
    file://adlink_spi_tool\
"

S = "${WORKDIR}"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/adlink_spi_tool" "${D}${bindir}/adlink_spi_tool"
}

do_package_qa() {
}


INSANE_SKIP_${PN} = "ldflags"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"  
FILES_${PN} += " ${bindir}/adlink_spi_tool "
