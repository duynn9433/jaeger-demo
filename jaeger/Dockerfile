# Use official Jaeger all-in-one image (v2.5.0)
FROM jaegertracing/jaeger:2.5.0

# Expose Jaeger Web UI
EXPOSE 16686

# Expose OTLP gRPC port
EXPOSE 4317

# Optionally expose OTLP HTTP and Zipkin ports if needed
# EXPOSE 4318
# EXPOSE 9411

# Default command (already set in the base image)
#CMD ["--config=/etc/jaeger/config.yaml"]