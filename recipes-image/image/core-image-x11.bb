DESCRIPTION = "Adlink Production Image with Sato support that includes everything within \
core-image-sato plus meta-toolchain, development headers and libraries to \
form a standalone SDK."
SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_FEATURES += " package-management ssh-server-dropbear hwcodecs \
	${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "", \
	   bb.utils.contains("DISTRO_FEATURES", "x11", "x11-base", "", d), d)} \
"
LICENSE = "MIT"

inherit core-image

REQUIRED_DISTRO_FEATURES = "x11"


IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"


AUTO_TEST_INSTALL = "\
	v4l-utils \
	cpufrequtils \
	usbutils \
	memtester \
	stress \
	libdrm-tests \
"

IMAGE_INSTALL += "packagegroup-core-x11 "
     	 	  

## ADLINK Specific
#LICENSE_FLAGS_WHITELIST = "commercial"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-good startupscript ifplugd"

export IMAGE_BASENAME = "adlink-x11-px30"

CORE_IMAGE_EXTRA_INSTALL += "gstreamer1.0-rockchip io wayland \
	alsa-utils \
	libdrm-rockchip \
	${AUTO_TEST_INSTALL} \
"


