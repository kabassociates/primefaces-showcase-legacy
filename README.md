# README 

Local copy primefaces showcase repository version 5.0 and later. Orginal sourses are available at google code svn repository, http://primefaces.googlecode.com/svn/showcase/trunk/

Master branch of this repository is aligned with orginal sources.

## How to run showcase

Rollup your sleeve, get ready to your hands wet with primefaces coding ...

### Using this repository
* Clone this repository
* Checkout branch 5.0.x
* Execute following maven command

`mvn clean jetty:run` 
 
### Running Maven profiles

Primefaces sample configured with few profiles in maven pom.xml they can be
invoked using command line (like below as additionl params `-Pgithub`), following list of profiles available in this repository. 

* dev
* stable
* elite
* github

### Running GITHUB profile

Running showcase with stable version of Primefaces github releases ... 

* Execute following maven command to GITHUB profile

`mvn clean jetty:run -Pgithub`

### TODO List

Orginal sources in master branch removed the support for testing sample with different version of JSF libraries and testing with myfaces JSF library. additional versions and myfaces would added to 5.0.x branch soon.
 