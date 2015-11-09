# bazel-example

## Installation

### Linux

- Install JDK:

```bash
$ sudo add-apt-repository ppa:webupd8team/java
$ sudo apt-get update
$ sudo apt-get install oracle-java8-installer
```

- Install required packages:

```bash
$ sudo apt-get install pkg-config zip g++ zlib1g-dev unzip
```

- Install Scala:

```bash
$ sudo wget http://downloads.typesafe.com/scala/2.11.7/scala-2.11.7.deb
$ sudo dpkg -i scala-2.11.7.deb
```

- Clone and build Bazel:

```bash
$ git clone https://github.com/bazelbuild/bazel.git
$ cd bazel
$ ./compile.sh
$ export PATH="$PATH:$(pwd)/output"
```

### OS X

Download installation from [Bazel releases](https://github.com/bazelbuild/bazel/releases) and:

```bash
$ sudo ./bazel-0.1.1-installer-darwin-x86_64.sh --bin=/usr/local/bin
```

- Create symlink for `scalac`:

```bash
$ sudo ln -s /usr/local/bin/scalac /usr/bin/scalac
```
