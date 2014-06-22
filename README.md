# README 

Local copy primefaces showcase repository new generation.

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
