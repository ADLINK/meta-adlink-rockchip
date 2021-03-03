SUMMARY = "ADLINK XFCE Desktop Manager "
SECTION = "x11/base"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-Added-Adlink-wallpaper.patch \
		   file://adlink.jpg \
		   file://0002-Adlink-Default-JPG-file.patch \	
"
 
do_configure_append() {
 cp -a ${WORKDIR}/adlink.jpg  ${WORKDIR}/xfdesktop-4.14.2/backgrounds 
}

FILES_${PN} += "${datadir}/backgrounds"
