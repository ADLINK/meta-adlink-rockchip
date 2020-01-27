# Copyright (C) 2019, Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)


PATCHPATH = "${CURDIR}/u-boot"
inherit auto-patch

PV = "2020.01+git${SRCPV}"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
SRCREV = "0f0484481cafd2d8882568d5583a1abf63e5fe2f"
SRC_URI = " \
        git://github.com/rockchip-linux/u-boot.git;branch=next-dev \
"






