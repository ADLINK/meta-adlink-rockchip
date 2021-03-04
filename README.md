<img src="https://www.linaro.org/assets/images/projects/yocto-project.png" width="200" align="right">
<br>

### Supported Hardware


|                         SMARC Module                         | Description                                                  | Yocto images                                                 |
| :----------------------------------------------------------: | :----------------------------------------------------------- | ------------------------------------------------------------ |
| <img src="https://cdn.adlinktech.com/webupd/products/images/1790/LEC-PX30_A2_F.jpg" width="200"/> | **LEC-PX30** ([More details](https://www.adlinktech.com/Products/Computer_on_Modules/SMARC/LEC-PX30?lang=en))  <br />     SMARC Short Size Module with <br />Rockchip PX30 Quad-Core ARM Cortex A35 | [click here](https://hq0epm0west0us0storage.blob.core.windows.net/public/SMARC/LEC-PX30/Images/Yocto/LEC-PX30-IPi-SMARC_Yocto-thud-v1.0_SD_20200226.zip)<br>With xfce desktop + MRAA/UPM<br>on I-Pi SMARC Carrier board <br>(Image size: 1.7 GB) |

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

#### Thud branch details


| **Layer**            | Git branch - ${BRANCH} | Git Commit Id - ${COMMIT_ID} |
| -------------------- | ---------- | ---------------------------------------- |
| Poky                 | thud       | 8cd3ee6e1a50ad9f40466bcadb236c619c42ef19 |
| meta-openembedded    | thud       | 446bd615fd7cb9bc7a159fe5c2019ed08d1a7a93 |
| meta-rockchip        | yocto-next | 5b8997a5992204cb773a55dca9406c0f95a4d061 |
| meta-adlink-rockchip | thud       | 127ad9187ef365930f8d71d5c46f3a9b3a56c34e |
| meta-adlink-sema     | sema4.0    | 2151d926328742ff577afd055f15be0a6397a644 |





<br>

Please feel free to send us (email: ryanzj.huang@adlinktech.com) patches for this layer or report any bugs found in this layer. 
<br> For hardware support, please contact your local representative.
