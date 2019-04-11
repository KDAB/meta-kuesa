# meta-kuesa
This is the kuesa metalayer for the Yocto buildsystem

## What to do when git lfs is slow
Kuesas examples come with quite some resources. 
If your `do_fetch` phase feels particularly slow (>15mins), please update your `git` version. 
The latest git versions will operate on git-objects instead of establishing a connection for every git lfs filedownload. 
