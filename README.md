## How to Build Yocto Image



### 1.  Recommended Hardware

- Intel Core-i7 processor (>= 4 cores)

- at least 4GB RAM

- at least 500GB disk space

- Linux OS for Yocto Project Build: Ubuntu 16.04 LTS

  

### 2.  Setup Environment

Please issue the following commands for installing the required software package to build Yocto BSP on your host PC.

```
$ sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath socat 
$ sudo apt-get install libsdl1.2-dev xterm 
$ sudo apt-get install make xsltproc docbook-utils fop dblatex xmlto
$ sudo apt-get install autoconf automake libtool libglib2.0-dev nfs-common xutils-dev
```

**Note**: 

- Please do NOT use “root” to build BSP. It will cause unpredictable error.
- Please do NOT name your folder by “Blank” in your build path.



### 3.  How to Build

#### 3.1 Fetch the source from various git locations and checkout the specific commit as below:

| **Layer**            | **Git Branch** | **Git Commit Id**                        |
| -------------------- | -------------- | ---------------------------------------- |
| Poky                 | rocko          | 5f660914cd7eec8117efccdf1eb29c466b4e74f7 |
| meta-rockchip        | yocto-next     | 4d842ec6d0e16da44e4868cbe272a2885af6f346 |
| meta-openembedded    | rocko          | eae996301d9c097bcbeb8046f08041dc82bb62f8 |
| meta-adlink-rockchip | rocko          | 6fdfb5d4135f873d1ef03ffbc31105eebfe5ae2d |

&nbsp;&nbsp;**Note**: 

​      Please check the correct branch for each layers and enter the variable ${BRANCH}
​         For example: 
​				git clone git://git.yoctoproject.org/poky.git -b **rocko**



- poky layer:

```
git clone git://git.yoctoproject.org/poky.git -b ${BRANCH}
cd poky
git checkout 5f660914cd7eec8117efccdf1eb29c466b4e74f7
cd ..
```

- meta-openmbedded layer:

```
git clone git://git.openembedded.org/meta-openembedded.git -b ${BRANCH}
cd meta-openembedded
git checkout eae996301d9c097bcbeb8046f08041dc82bb62f8
cd ..
```

- meta-rockchip layer:

```
git clone https://github.com/rockchip-linux/meta-rockchip.git -b ${BRANCH}
cd meta-openembedded
git checkout 4d842ec6d0e16da44e4868cbe272a2885af6f346
cd ..
```

- ADLINK layer:

```
git clone https://github.com/adlink/meta-adlink-rockchip.git -b ${BRANCH}
cd meta-adlink-rockchip
git checkout 6fdfb5d4135f873d1ef03ffbc31105eebfe5ae2d
cd ..
```



#### 3.2 Configure

- Set up the build environment variables and build directory

```
source poky/oe-init-build-env
```

- Modify the layers as ADLINK configuration

```
cp ../meta-adlink-x86-64bit/conf/Adlink-conf/*.conf conf/
```

 

#### 3.3  Start to build the image

| Image Type                | command                 |
| ------------------------- | ----------------------- |
| minimal & basic functions | bitbake core-image-mini |



#### 3.4  Images Location

After finished, images will be located at `{BSP_FOLDER}/build/tmp/deploy/image/${machine}/`









