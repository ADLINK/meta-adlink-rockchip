<img src="https://www.linaro.org/assets/images/projects/yocto-project.png" width="200" align="right">
<br>

### Supported Hardware


|                         SMARC Module                         | Description                                                  | Yocto images                                                 |
| :----------------------------------------------------------: | :----------------------------------------------------------- | ------------------------------------------------------------ |
| <img src="https://cdn.adlinktech.com/webupd/products/images/1790/LEC-PX30_A2_F.jpg" width="200"/> | **LEC-PX30** ([More details](https://www.adlinktech.com/Products/Computer_on_Modules/SMARC/LEC-PX30?lang=en))  <br />     SMARC Short Size Module with <br />Rockchip PX30 Quad-Core ARM Cortex A35 | [- zeus](https://github.com/ADLINK/meta-adlink-rockchip/tree/zeus#zeus-branch-details)<br>[- thud](https://github.com/ADLINK/meta-adlink-rockchip/tree/thud#thud-branch-details) |

<br />

#### Thud branch details

| **Layer**            | ${BRANCH}  | ${COMMIT_ID}                       |
| -------------------- | ---------- | ---------------------------------------- |
| Poky                 | thud       | 8cd3ee6e1a50ad9f40466bcadb236c619c42ef19 |
| meta-openembedded    | thud       | 446bd615fd7cb9bc7a159fe5c2019ed08d1a7a93 |
| meta-rockchip        | yocto-next | 5b8997a5992204cb773a55dca9406c0f95a4d061 |
| meta-adlink-rockchip | thud       | ebd480c8408ab386e14d32007b64c8c2886e279f |

<br />

**Yocto Image for the quick evaluation**

* SD Card Image with xfce Desktop environment (carrier board: IPi-SMARC, image size: 1.7GB): [download link](https://hq0epm0west0us0storage.blob.core.windows.net/public/SMARC/LEC-PX30/Images/Yocto/LEC-PX30-IPi-SMARC_Yocto-thud-v1.0_SD_20200226.zip)

**Note**: 
   1. Login name/password are not required 
   2. root password: **adlink123**

 
<br>


Please feel free to send us (email: ryanzj.huang@adlinktech.com) patches for this layer or report any bugs found in this layer. 
<br> For hardware support, please contact your local representative.
