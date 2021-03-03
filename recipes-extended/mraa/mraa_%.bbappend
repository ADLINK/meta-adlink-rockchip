
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=91e7de50a8d3cf01057f318d72460acd"
SRCREV = "e15ce6fbc76148ba8835adc92196b0d0a3f245e7"

SRC_URI += " \
        file://0001-Added-Test-applications-support.patch \
	file://0001-Corrected-UART-Physical-address.patch \
"

SRC_URI[md5sum] = "84d7bb70c7a3a8f1f56e38fedda10399"
SRC_URI[sha256sum] = "7400616c3e6e0901065bec25d38d6b77f1d26291ba69be2cd4b04791ff11cdce"


do_install_append() {
	install -d ${D}/usr/share/mraa
	cp -r ${B}/examples/ ${D}/usr/share/mraa
}

