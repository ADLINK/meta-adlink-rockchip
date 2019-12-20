SUMMARY = "Linux Library for low speed I/O Communication"
SECTION = "libs"

LICENSE = "CLOSED"

SRCREV = "7390a5dd4f5bacbbb2bb7f83b6644d9dbf1cd1cc"
PV = "1.0.0-git"

SRC_URI = "git://github.com/ADLINK-EPM/mraa.git;protocol=http \
           "

SRC_URI[md5sum] = "6058d6943ef951bc90c53cb53a8a669b"
SRC_URI[sha256sum] = "6f57dd3fe86c9c33cb1ce001916a06a7dc3678147934372190359f0741f2517c"

S = "${WORKDIR}/git"

# CMakeLists.txt checks the architecture, only x86 and ARM supported for now
COMPATIBLE_HOST = "(x86_64.*|i.86.*|aarch64.*|arm.*)-linux"
#COMPATIBLE_HOST = '(x86_64|i.86|powerpc64|arm|aarch64|microblazeel|mips).*-linux'


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
