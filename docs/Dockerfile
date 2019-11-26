FROM jekyll/jekyll

EXPOSE 4000

WORKDIR /src
COPY . /src/

RUN chown -R jekyll /src
ENTRYPOINT ["jekyll", "serve", "-H", "0.0.0.0"]
