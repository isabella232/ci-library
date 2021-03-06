package com.mariadb.es

class Build {
  static currentCommit
  static currentBranch
  static commiterNames
  // number of changed files
  static changedFiles
  // the list of changed files
  static changedFilesList = ""
  static commiterEmail
  static currentVersion
  static minorVersion
  static shortVersion
  static fullVersion
  static serverMaturity

  static defaultMtrParams = "--force --max-test-fail=0 --testcase-timeout=120 --vardir=${mysqlVardir}"
  final static mysqlVardir = '/var/tmp/mtr'

  static slackResponse
  static buildinfo
}
