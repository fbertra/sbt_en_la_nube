sbt_en_la_nube
==============

"SBT in the cloud"

Toy project to test Cloud based IDE like Cloud9 https://c9.io/ and Codeenvy https://codenvy.com/

The original idea was to use SBT, but Codeenvy supports maven only.
 

Steps to install SBT on cloud9
==============================

Switch on Terminal WIndows

- download sbt
 
  $ cd
  
  $ wget http://repo.scala-sbt.org/scalasbt/sbt-native-packages/org/scala-sbt/sbt//0.12.4/sbt.tgz  
 
  $ tar xvf sbt.tgz

- create directories for SBT boot and ivy

  $ mkdir sbt/boot
  
  $ mkdir ivy

- create a shell named "sbt" in $HOME/bin with the content:

  $ cd $HOME/bin
  
  $ vi sbt
  
  $ # note: vi working in the browser...surprising
  
- insert this content 

  $HOME/sbt/bin/sbt -Dsbt.boot.directory=$HOME/sbt/boot -Dsbt.dir=$HOME/sbt -Dsbt.ivy.home=$HOME/ivy

- change the file permission

  $ chmod u+x sbt

That's it, sbt should run from all directory.  For the rest, you need to use Cloud9 UI.﻿
