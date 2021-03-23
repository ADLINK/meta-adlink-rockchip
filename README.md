<img src="https://www.linaro.org/assets/images/projects/yocto-project.png" width="200" align="right">
<br>

### Supported Hardware


|                         SMARC Module                         | Description                                                  | Yocto images                                                 |
| :----------------------------------------------------------: | :----------------------------------------------------------- | ------------------------------------------------------------ |
| <img src="https://cdn.adlinktech.com/webupd/products/images/1790/LEC-PX30_A2_F.jpg" width="200"/> | **LEC-PX30** ([More details](https://www.adlinktech.com/Products/Computer_on_Modules/SMARC/LEC-PX30?lang=en))  <br />     SMARC Short Size Module with <br />Rockchip PX30 Quad-Core ARM Cortex A35 | [click here](https://hq0epm0west0us0storage.blob.core.windows.net/$web/public/SMARC/LEC-PX30/Images/Yocto/LEC-PX30-IPi-SMARC_Yocto-dunfell-v1.0-20210404.zip)<br>With xfce desktop +  SEMA4.0 <br>on I-Pi SMARC Carrier board <br>(Image size: 1.7 GB) |
<br />
      

**Note**: 

1. Login name/password are not required. 

2. root password: **adlink123**

<br>

**How to build Yocto Image**

* see [documentation](https://github.com/ADLINK/meta-adlink-rockchip/wiki/01.-Build-Yocto-Image-on-LEC-PX30-with-IPi-SMARC) for more details.

**How to flash image to your storage**

* [Boot from SD card](https://github.com/ADLINK/meta-adlink-rockchip/wiki/02.-How-to-flash-Image-into-SD-Card)

<br>



#### Dunfell Branch details

| **Layer**            | **Git Branch - ${BRANCH}** | **Git Commit Id - ${COMMIT_ID}**                 |
| -------------------- | -------------- | ---------------------------------------- |
| Poky                 | dunfell        | e32d854e33bc86c2a616df8708e021a098afcf73 |
| meta-openembedded    | dunfell        | f2d02cb71eaff8eb285a1997b30be52486c160ae |
| meta-rockchip        | yocto-next     | 00b19d0a8856b64e979063cec6385c100e427f20 |
| meta-adlink-rockchip | dunfell        | 118e6c6770e82faf7eedb40f617f936a9c1b6f21 |
| meta-adlink-sema     | sema4.0        | 4aaa1081ea64b7258f0ce94dd307085c60ebc29d |
| meta-python2         | dunfell        | 07dca1e54f82a06939df9b890c6d1ce1e3197f75 |

 

<br>

Please feel free to send us (email: ryanzj.huang@adlinktech.com) patches for this layer or report any bugs found in this layer. 
<br> For hardware support, please contact your local representative.
