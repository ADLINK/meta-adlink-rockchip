
#KBUILD_DEFCONFIG = "px30_linux_defconfig"

SRCREV = "e83084b53d4e02f5fd25aad25b42ffd3108c7f15"
KERNEL_DEFCONFIG = "adlink-px30_config"

SRC_URI += " \
	file://adlink-px30_config \
	file://0001-Device-tree-for-LEC-PX30.patch \
"		

do_copy_defconfig() {
    cp ${WORKDIR}/${KERNEL_DEFCONFIG} ${S}/arch/arm64/configs/
    cp ${S}/arch/arm/configs/${KERNEL_DEFCONFIG} ${B}/.config
    cp ${S}/arch/arm/configs/${KERNEL_DEFCONFIG} ${B}/../defconfig

}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


