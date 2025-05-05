# OWASP Dependency-Check Maven + GitLab CI Example

This repository provides a minimal example of how to configure and run the [OWASP Dependency-Check Maven plugin](https://github.com/dependency-check/DependencyCheck) in a GitLab CI/CD pipeline.

## Overview

The setup includes:
- A basic `pom.xml` with OWASP Dependency-Check plugin configuration
- A `.gitlab-ci.yml` file to run the scan in GitLab CI
- Simple Spring Boot project

## Files of Interest

- [pom.xml](./pom.xml): Configures the OWASP Dependency-Check Maven plugin.
- [.gitlab-ci.yml](./.gitlab-ci.yml): Defines the GitLab CI pipeline steps to run the scan.
