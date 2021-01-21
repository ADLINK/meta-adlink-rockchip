SRCREV = "5d8bef2ca7fbb8b2706ba6572b568b6044c727a5"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://20-modesetting.conf"

do_install_append() {
    install -d ${D}${datadir}/X11/xorg.conf.d
    install -m 0755 ${WORKDIR}/20-modesetting.conf \
        ${D}${datadir}/X11/xorg.conf.d/20-modesetting.conf
}
