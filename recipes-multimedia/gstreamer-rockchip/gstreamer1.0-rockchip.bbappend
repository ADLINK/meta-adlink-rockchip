

delete_pkg_m4() {
	# Delete m4 files which we provide patched versions of but will be
	# ignored if these exist
	rm -f "${S}/common/m4/pkg.m4"
	rm -f "${S}/common/m4/gtk-doc.m4"
}

do_configure[prefuncs] = " delete_pkg_m4"


