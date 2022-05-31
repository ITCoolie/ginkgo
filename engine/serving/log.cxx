#include "log.h"

namespace logging = boost::log;
namespace src = boost::log::sources;
namespace sinks = boost::log::sinks;
namespace keywords = boost::log::keywords;

/*日志初始化函数，设置日志目录
 */
void log_init(string filepath) {
	logging::add_file_log(filepath);
	logging::core::get()->set_filter(logging::trivial::severity>=logging::trivial::debug);
}

/*日志反初始化函数
 */
void log_uninit() {
}
