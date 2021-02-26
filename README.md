<img src="https://www.linaro.org/assets/images/projects/yocto-project.png" width="200" align="right">
<br>

### Supported Hardware


|                         SMARC Module                         | Description                                                  |
| :----------------------------------------------------------: | :----------------------------------------------------------- |
| <img src="https://cdn.adlinktech.com/webupd/products/images/1790/LEC-PX30_A2_F.jpg" width="200"/> | **LEC-PX30** ([More details](https://www.adlinktech.com/Products/Computer_on_Modules/SMARC/LEC-PX30?lang=en))  <br />     SMARC Short Size Module with Rockchip PX30 Quad-Core ARM Cortex A35<br /> |

<br />

**List of the current branch and Yocto Image**

| **PX30 Yocto BSP branch**                                    | **SD card image with xfce Desktop <br>(carrier board: IPi-SMARC)** | **Image size** |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------- |
| dunfell ( ready by the end of Mar)                           |                                                              |                |
| [zeus](https://github.com/ADLINK/meta-adlink-rockchip/tree/zeus) (kernel version: **4.4**) | [download link](https://hq0epm0west0us0storage.blob.core.windows.net/public/SMARC%2FLEC-PX30%2FImages%2FYocto%2FLEC-PX30-IPi-SMARC_Yocto-Zeus-v1.4_SD_20200514.zip) | 1.8GB          |
| [thud](https://github.com/ADLINK/meta-adlink-rockchip/tree/thud) (kernel version: **4.4**) | [download link](https://hq0epm0west0us0storage.blob.core.windows.net/public/SMARC/LEC-PX30/Images/Yocto/LEC-PX30-IPi-SMARC_Yocto-thud-v1.0_SD_20200226.zip) | 1.7GB          |

**Note**: 

1. Login name/password are not required. 

2. root password: **adlink123**

<br>

**How to build Yocto Image**

* see [documentation](https://github.com/ADLINK/meta-adlink-rockchip/wiki/01.-Build-Yocto-Image-on-LEC-PX30-with-IPi-SMARC) for more details.

**How to flash image to your storage**

* [Boot from SD card](https://github.com/ADLINK/meta-adlink-rockchip/wiki/02.-How-to-flash-Image-into-SD-Card)

<br>
<br>

Please feel free to send us (email: ryanzj.huang@adlinktech.com) patches for this layer or report any bugs found in this layer. 
<br> For hardware support, please contact your local representative.
