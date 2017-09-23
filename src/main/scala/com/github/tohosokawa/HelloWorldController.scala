package com.github.tohosokawa

import gitbucket.core.controller.ControllerBase

class HelloWorldController extends ControllerBase {

  get("/helloworld"){
    "Hello World!"
  }

}
