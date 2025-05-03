#!/bin/bash

DIRECTORY="../" # Directory to process

# List of replacement pairs (OLD -> NEW)
OLD_TEXTS=(
  "dev.trindadedev.template"
  "TemplateApp"
  "TemplateApp"
  "templateapp"
  "TemplateApp"
)
NEW_TEXTS=(
  "dev.trindadedev.template"
  "TemplateApp"
  "TemplateApp"
  "templateapp"
  "TemplateApp"
)

# Find and process files, excluding scripts and .git
find "$DIRECTORY" -path "$DIRECTORY/scripts" -prune -o -path "$DIRECTORY/.git" -prune -o -type f -print | while read -r file; do
  [[ "$file" == *".git/"* || "$file" == *"scripts/"* ]] && continue

  for i in "${!OLD_TEXTS[@]}"; do
    OLD="${OLD_TEXTS[$i]}"
    NEW="${NEW_TEXTS[$i]}"
    sed -i "s/$OLD/$NEW/g" "$file"
  done

  echo "Text replaced in: $file"
done

echo "Replacement completed!"