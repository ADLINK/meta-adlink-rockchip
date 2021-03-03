SRCREV = "d1c47e8b47699a95e49ce61d7b4fb4559228c4c2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://20-modesetting.conf"

do_install_append() {
    install -d ${D}${datadir}/X11/xorg.conf.d
    install -m 0755 ${WORKDIR}/20-modesetting.conf \
        ${D}${datadir}/X11/xorg.conf.d/20-modesetting.conf
}
