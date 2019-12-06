
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += " \
        file://0001-Added-temporary-fix-to-avoid-compilation-issue-for-systemd-recipe.patch \
"

