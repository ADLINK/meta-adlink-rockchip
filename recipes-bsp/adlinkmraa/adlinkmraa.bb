SUMMARY = "Linux Library for low speed I/O Communication"
SECTION = "libs"

LICENSE = "CLOSED"

SRCREV = "e15ce6fbc76148ba8835adc92196b0d0a3f245e7"
PV = "1.9.0-git${SRCPV}"

SRC_URI = "git://github.com/intel-iot-devkit/mraa.git;protocol=http \
	   file://0001-Added-Test-applications-support.patch \
           "


S = "${WORKDIR}/git"

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
