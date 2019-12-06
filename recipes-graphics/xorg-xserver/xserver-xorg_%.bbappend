
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += " \
        file://0001-Fixed-compilation-error-for-xserver-xorg-recipe.patch \
"

