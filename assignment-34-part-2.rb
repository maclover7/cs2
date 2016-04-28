require 'pathname'

class Application
  MERGED_FILE_NAME = "#{Pathname.pwd}/namesmerged.txt"
  NAMES_FILE_1 = "#{Pathname.pwd}/names1.txt"
  NAMES_FILE_2 = "#{Pathname.pwd}/names2.txt"

  def run
    names = []
    names.concat(File.readlines(NAMES_FILE_1))
    names.concat(File.readlines(NAMES_FILE_2))
    names.each { |n| n.delete!("\n") }

    # make sure there's no duplicates
    names = names.uniq

    # alphabetize
    names.sort_by!(&:downcase)

    # output to File
    File.open(MERGED_FILE_NAME, 'w+') do |file|
      names.each { |n| file.write("#{n}\n") }
    end

    puts 'Would you like to see the list of names in the terminal? (y/n)'
    if gets.chomp == 'y'
      names.each { |n| puts n }
    end
  end
end

Application.new.run
