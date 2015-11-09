# bazel-example

## Requirements

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
```

- Add `bazel` to `PATH`:

```bash
$ export PATH="$PATH:$(pwd)/output"
```
