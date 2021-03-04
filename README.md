<img src="https://www.linaro.org/assets/images/projects/yocto-project.png" width="200" align="right">
<br>

### Supported Hardware Board List


|                         SMARC Module                         | Description                                                  | SD card image                                                |
| :----------------------------------------------------------: | :----------------------------------------------------------- | ------------------------------------------------------------ |
| <img src="https://cdn.adlinktech.com/webupd/products/images/1790/LEC-PX30_A2_F.jpg" width="200"/> | **LEC-PX30** ([More details](https://www.adlinktech.com/Products/Computer_on_Modules/SMARC/LEC-PX30?lang=en))  <br />     SMARC Short Size Module with <br />Rockchip PX30 Quad-Core ARM Cortex A35 | [click here](https://hq0epm0west0us0storage.blob.core.windows.net/public/SMARC%2FLEC-PX30%2FImages%2FYocto%2FLEC-PX30-IPi-SMARC_Yocto-Zeus-v1.4_SD_20200514.zip) <br>with xfce desktop + MRAA/UPM <br>on I-Pi SMARC carrier board<br>(image size: 1.8 GB) |

**Note**: 
1. Login name/password are not required
2. root password: **adlink123**



<br>

#### How to build Yocto Image

* see [documentation](https://github.com/ADLINK/meta-adlink-rockchip/wiki/01.-Build-Yocto-Image-on-LEC-PX30-with-IPi-SMARC) for more details.

#### How to flash image to your storage**

* [Boot from SD card](https://github.com/ADLINK/meta-adlink-rockchip/wiki/02.-How-to-flash-Image-into-SD-Card)

<br>

<br>


#### Zeus Branch details

| **Layer**            | **Git Branch - ${BRANCH}** | **Git Commit Id - ${COMMIT_ID}**                 |
| -------------------- | -------------- | ---------------------------------------- |
| Poky                 | zeus           | f9ef210967ab34168d4a24930987dc0731baf56f |
| meta-openembedded    | zeus           | bb65c27a772723dfe2c15b5e1b27bcc1a1ed884c |
| meta-rockchip        | yocto-next     | d571e890e0f7ed28fa5a6f72cfe42eaca31352fb |
| meta-adlink-rockchip | zeus           | 57032e96bcbc71813953c5410e74bdab12ae3a27 |
| meta-adlink-sema     | sema4.0        | 2151d926328742ff577afd055f15be0a6397a644 |
| meta-python2         | zeus           | 4400f9155ec193d028208cf0c66aeed2ba2b00ab |

 


<br>

Please feel free to send us (email: ryanzj.huang@adlinktech.com) patches for this layer or report any bugs found in this layer. 
<br> For hardware support, please contact your local representative.
