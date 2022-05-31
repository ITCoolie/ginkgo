#ifndef __LOG_H__
#define __LOG_H__

#define BOOST_LOG_DYN_LINK 1  

#include <string>
using namespace std;

#include <boost/log/core.hpp>
#include <boost/log/trivial.hpp>
#include <boost/log/expressions.hpp>
#include <boost/log/sinks/text_file_backend.hpp>
#include <boost/log/utility/setup/file.hpp>
#include <boost/log/utility/setup/common_attributes.hpp>
#include <boost/log/sources/severity_logger.hpp>
#include <boost/log/sources/record_ostream.hpp>
#include <boost/log/support/date_time.hpp>

#define LOG_INFO     BOOST_LOG_TRIVIAL(info)
#define LOG_DEBUG    BOOST_LOG_TRIVIAL(debug)
#define LOG_WARNING  BOOST_LOG_TRIVIAL(warning)
#define LOG_ERROR    BOOST_LOG_TRIVIAL(error)

void log_init(string filepath);
void log_uninit();

#endif //__LOG_H__