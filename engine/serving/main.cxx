#define BOOST_LOG_DYN_LINK 1  

#include <boost/program_options.hpp>
#include <boost/filesystem/operations.hpp>
#include <boost/filesystem/path.hpp>
#include <boost/filesystem/convenience.hpp>
#include <iostream>
#include "log.h"


int main(int argc, char *argvp[]) {

    log_init("./serving.log");
    LOG_INFO << "hello world!";
    return 0;
}