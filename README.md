BEAGLE-ROS project
==================

![BeagleBone](http://beagleboard.org/static/images/beagle_logo_hdr.gif)
![ROS](http://www.ros.org/_wiki/images/ros_org.png)

Integration of the Robot Operative System (ROS) and the BeagleBone through the [meta-ros](https://github.com/bmwcarit/meta-ros) project, a layer for OpenEmbedded Linux.

This project is part of the Google Summer of Code (GSOC) 2013.
The aim is to work in the integration of the Robot Operative System (ROS) and the BeagleBone. Both ROS and the BeagleBone are great tools and increasingly being used in robotics. Having both of them working together in a easy way would be a great asset. 

A lot of users show their interest for ARM ROS integration. Some made a couple of tutorials about how to install ROS on Ubuntu on the BeagleBoard however this documentation is getting a bit old fashioned and probably not the right way. There's also some code to use lightweight versions of ROS but again, roboticists might not be looking for a light-ROS device but a fully functional one.

--------

It's highly recommended to have the last version of Angstrom.

--------

##Description of the files:

* **LICENSE**: License of the code.

* **README.md**: This document.

* **scripts**: Scripts to automate processes.

* **docs**: Documentation.

* **lib**: Libraries used.

* **recipes**: OpenEmbedded recipes. These recipes should be used with the meta-ros code.

* **conf**: OpenEmbedded configuration directory. This directory is added so that the beagle-ros project can be directly added as a layer in Angstrom/OpenEmbedded systems.



USAGE
=====
##Getting roscore running

* Get an Angstrom distribution following http://www.angstrom-distribution.org/building-angstrom.

* Put the MLO, u-boot and FS in the SD card as explained in http://downloads.angstrom-distribution.org/demo/beaglebone/.

* Update the Angstrom feed through `opkg update`.

* Install git using `opkg install git`.

* Get the **beagle-ros** code: `git clone git://github.com/vmayoral/beagle-ros.git`.

* Install all the packages for ROS in Angstrom (30 minutes):
 ```
 cd beagle-ros/scripts
 source minimal-ros-install-angstrom.sh
 ```

* ~~source `/usr/setup.bash`. Updates in the ROS recipes doesn't install scripts in the `/usr/` directory anymore. To configure the enviroment properly check this [bashrc](https://github.com/vmayoral/beagle-ros/blob/master/scripts/bashrc) file.~~

* run `roscore`.
    
##First steps
Getting started with Angstrom (or OpenEmbedded) and bitbake might be a bit tough at the beggining but it gets better and after a while you will love it, promised ;). First, take a look at the [FAQ](https://github.com/vmayoral/beagle-ros/wiki/FAQ).

Beagle-ROS makes use of the meta-ros project, an OpenEmbedded layer that provides ROS to embedded devices. In order to get comfortable with meta-ros the [diving-meta-ros](https://github.com/vmayoral/diving-meta-ros) repo aims to give you some aid with the first steps (take into account that this tutorial assumes that you are already comfortable with ROS. If not take a look at their [tutorials](http://www.ros.org/wiki/ROS/Tutorials)).
    
##Installing the recipes
The easiest way to install the bitbake recipes provided is to `git clone` the beagle-ros code directly into the Angstrom `sources/` directory and add the beagle-ros as a layer:
* Edit `conf/bblayers.conf`
* add `${TOPDIR}/sources/beagle-ros \` to the `BASELAYERS` variable

It's also possible to add the recipes inside of the meta-ros code. There're instructions in https://github.com/vmayoral/beginner_tutorials/blob/master/README.md of how to put these recipes in the meta-ros file structure.

##Cross-compiling the recipes
From the `TOPDIR` of Angstrom run `bitbake <recipe-name>`. For example:
* `bitbake beginner-tutorials`
* `bitbake roscpp-tutorials`

