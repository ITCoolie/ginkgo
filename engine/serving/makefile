#目标生成文件
TARGET_NAME = serving
TARGET_PATH = .

#头文件目录
INCLUDE := /usr/local/include
#依赖库文件目录
LIB := /usr/local/lib

CC = g++

CFLAGS := -Wall -g3 -O3
CFLAGS += -I$(INCLUDE)

LDFLAGS := -Wl,-rpath=$(shell pwd) -L$(LIB) -pthread -lstdc++ -lboost_thread -lboost_system -lboost_log
OBJECTS := $(patsubst %.c, %.o, $(wildcard *.cxx))

.PHONY: clean all
clean:
	@rm -f *.o *.so

all: $(OBJECTS)
	$(CC)  $(CFLAGS)  -o  $(TARGET_PATH)/$(TARGET_NAME)  $(OBJECTS)  $(LDFLAGS)

%.o: %.cxx
	$(CC) -c $(CFLAGS) $< -o $@

