#!/bin/bash

cd /usr/sbin
./rkisp_daemons start
cd ..

#export GST_DEBUG=*:5
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/lib/gstreamer-1.0
export XDG_RUNTIME_DIR=/tnp/.xdg
#gst-launch-1.0 v4l2src device=/dev/video1 ! video/x-raw, format=NV12, width=640, height=480, framerate=30/1 ! kmssink can_scale=false

#gst-launch-1.0 v4l2src ! video/x-raw, width=640, height=480, framerate=30/1 ! xvimagesink

gst-launch-1.0 v4l2src ! video/x-raw, width=640, height=480, framerate=30/1 ! glimagesink
