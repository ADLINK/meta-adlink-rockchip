
SRCREV = "67a812cfe7b47826a2a718ef09c87adef8e19874"

do_install_append() {

	# Yocto zeus would have libffi7
	patchelf ${D}/${libdir}/libMali.so.1 \
		--replace-needed libffi.so.6 libffi.so

	ln -sf libMali.so.1 ${D}/${libdir}/libMali.so
}
