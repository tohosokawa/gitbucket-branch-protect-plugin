gitbucket-branch-protect-plugin [![Build Status](https://travis-ci.org/tohosokawa/gitbucket-branch-protect-plugin.svg?branch=master)](https://travis-ci.org/tohosokawa/gitbucket-branch-protect-plugin)
========

Usually, the branch protect function save the following.

* Delete
* Force push

But, I want to protect non-force push from non admin users, too.

## Install

Copy `gitbucket-branch-protect-plugin_xxxx.jar` to `~/.gitbucket/plugins`

Please refer gitbucket plugin [Install and Test](https://gitbucket.github.io/gitbucket-news/gitbucket/2015/06/29/how-to-create-plugin.html#install-and-test).

## How to Use

This plugin use the default branch protect setting.

After this plugin installed, the protected branch will refuse non-force push from non-admin users.

## Others

This hook code based
[ProtectedBranchService.scala](https://github.com/gitbucket/gitbucket/blob/85b83af73f167b766a5046cd06699807148ab39b/src/main/scala/gitbucket/core/service/ProtectedBranchService.scala)
. This is default branch protect hook.