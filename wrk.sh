HOST="$1"
WRK_TEST_NAME="$2"

export WRK_TEST_NAME="$WRK_TEST_NAME"

wrk -t 1 -c 1 -d 5s -s log.lua --timeout 300s "http://$HOST:8081"