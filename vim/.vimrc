"el fondo es oscuro
	set bg=dark

"cuando buscas se subraya lo vas buscando
	set hlsearch

"sets default clipboard to the system clipboard
	set clipboard=unnamedplus

"Copy selected text to system clipboard
	vnoremap <C-c> "+y
	map <C-p> "+P

" Paste from system clipboard with ctrl+i
	map <S-Insert> <C-i>

"tab de 4 espacios
	set tabstop=4
	set softtabstop=4
	set shiftwidth=4

"convierte el tab en espacios
	set expandtab
	set autoindent
	set fileformat=unix

"para que se vea el numero de la fila
	set number relativenumber

"activar el autocompletar
	set wildmode=longest,list,full

"filetype plugin on
	syntax on
