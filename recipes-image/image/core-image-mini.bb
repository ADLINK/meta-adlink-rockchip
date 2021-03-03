DESCRIPTION = "Adlink Production Image with Sato support that includes everything within \
core-image-sato plus meta-toolchain, development headers and libraries to \
form a standalone SDK."
SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL_append = " packagegroup-base packagegroup-core-full-cmdline usbutils i2c-tools can-utils alsa-utils lmsensors-sensors dhcp-server dhcp-client pkgconfig connman startupconfig cmake packagegroup-core-buildessential vim python3-upm upm upm-dev python3-mraa mraa-utils mraa-dev mraa-doc mraa minicom git inetutils iw  "

LICENSE = "MIT"

inherit core-image


IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"


export IMAGE_BASENAME = "minimal-sd"



