FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append += " file://imx219_default_default.xml \
                    file://camera_rkisp_test.sh \
                  "

do_install_append() {

        install -m 0644 ${WORKDIR}/imx219_default_default.xml ${D}${sysconfdir}/iqfiles/

	install -d 0755 ${D}${sbindir}
	install -m 0755 ${WORKDIR}/camera_rkisp_test.sh ${D}${sbindir}/camera_rkisp_test
	install -m 0755 ${WORKDIR}/rkisp_daemons.sh ${D}${sbindir}/rkisp_daemons
}

do_package_qa() {
}

FILES_${PN} += "\
    ${sysconfdir}/iqfiles/imx219_default_default.xml \
    ${sbindir}/camera_rkisp_test \
    ${sbindir}/rkisp_daemons \
"
