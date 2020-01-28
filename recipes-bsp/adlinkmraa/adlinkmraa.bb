SUMMARY = "Linux Library for low speed I/O Communication"
SECTION = "libs"

LICENSE = "CLOSED"

SRCREV = "892113456556c26dd60ff4940155e8d92a9a8daf"

PV = "1.0.0-git"

SRC_URI = "file://mraa"

S = "${WORKDIR}/mraa"

# CMakeLists.txt checks the architecture, only x86 and ARM supported for now
COMPATIBLE_HOST = "(x86_64.*|i.86.*|aarch64.*|arm.*)-linux"

inherit cmake

DEPENDS += "json-c"

EXTRA_OECMAKE_append = " -DINSTALLTOOLS:BOOL=ON -DFIRMATA=ON -DCMAKE_SKIP_RPATH=ON \
                         -DPYTHON3_PACKAGES_PATH:PATH=${baselib}/python${PYTHON_BASEVERSION}/site-packages \
                       "
do_install_append() {
	install -d ${D}/usr/share/mraa
	cp -r ${B}/examples/ ${D}/usr/share/mraa
}


FILES_${PN} += "${datadir}"
FILES_${PN} += "${libdir}"
FILES_${PN} += "${includedir}"
FILES_${PN} += "${bindir}"
