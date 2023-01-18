#!/bin/bash

# Nombre del script de compilación
compile_script="javac_prg.sh"

# # Busca el primer archivo .java en el directorio actual y sus subdirectorios
# file=$(find . -name "*.java" -print -quit)
# 
# # Verifica si se ha encontrado algún archivo
# if [ -z "$file" ]
# then
#     echo "No se ha encontrado ningún archivo .java en el directorio actual y sus subdirectorios"
#     exit 1
# fi

# Compila y ejecuta el archivo
javac *.java
#java ${file%.*}
git add --all
git commit -am "en_proces"
prgtest.sh
git pull
git push
