DESCRIPTION = "ADLINK BSP Image with XFCE X Window"

LICENSE = "MIT"

IMAGE_FEATURES += " package-management ssh-server-dropbear hwcodecs"

inherit core-image

REQUIRED_DISTRO_FEATURES = " x11 "

IMAGE_INSTALL += "packagegroup-core-x11 \
     	 	  packagegroup-xfce-base "
		  
export IMAGE_BASENAME = "adlink-xfce-rockchip"


### XFCE Tools
IMAGE_INSTALL += " xterm xclock twm xinit-env startupconfig "

