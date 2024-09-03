#!/bin/bash

# Number of requests to send
NUM_REQUESTS=10000

# URL to send requests to
URL="http://localhost:30001/welcome"

# Loop to send requests
for ((i=1;i<=NUM_REQUESTS;i++)); do
    #echo "Sending request #$i"
    RESPONSE=$(curl -s "$URL")
    echo "Response #$i: $RESPONSE"

    # Optional: Uncomment the next line to add a short delay between requests
    sleep 0.01
done

# Wait for all background jobs to finish
wait

echo "$NUM_REQUESTS requests sent to $URL"
