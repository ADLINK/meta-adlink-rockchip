DESCRIPTION = "This is a system daemon implementing the startup script for alsa sound state"
LICENSE = "CLOSED"

SRC_URI = "file://S80alsa.sh"

S = "${WORKDIR}"

INITSCRIPT_NAME = "S80alsa.sh"

do_install () {
        install -d ${D}/${sysconfdir}/rc5.d
	install -m 0755 "${S}/S80alsa.sh" "${D}${sysconfdir}/rc5.d"

}
