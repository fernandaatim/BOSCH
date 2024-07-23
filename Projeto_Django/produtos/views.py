from django.shortcuts import render, redirect, get_object_or_404
from .models import Produtos
from .forms import ProdutosForms

def lista_produtos(request):
    produtos = Produtos.objects.all()
    busca = request.GET.get('search')
    
    if busca:
        produtos = produtos.filter(descricao__icontains = busca)
    return render(request, 'produtos/lista_produtos.html', {'produtos': produtos})

def cria_produto(request):
    if request.method=='POST':
        form = ProdutosForms(request.POST)
        if form.is_valid():
            form.save()
            return redirect('lista_produtos')
    else:
        form = ProdutosForms()
    return render(request, 'produtos/cria_produto.html',{'form':form})


def edita_produto(request,pk):
    produtos= get_object_or_404(Produtos,pk=pk)
    if request.method == 'POST':
        form = ProdutosForms(request.POST, instance=produtos)
        if form.is_valid():
            form.save()
            return redirect('lista_produtos')
    else: 
        form=ProdutosForms(instance=produtos)
    return render(request, 'produtos/edita_produto.html',{'form':form})

def deleta_produto(request,pk):
    produtos=get_object_or_404(Produtos,pk=pk)
    produtos.delete()
    return redirect('lista_produtos')
